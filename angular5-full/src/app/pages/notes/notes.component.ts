import {Component, ElementRef, HostListener, OnInit, ViewChild} from "@angular/core";
import {FormBuilder, FormGroup} from "@angular/forms";
import * as MarkdownIt from "markdown-it";
import {Note} from "../../shared/services/notes/notes";
import {NoteService} from "../../shared/services/notes/notes.service";
import {GlobalState} from "../../app.state";
import {ConfigService} from "../../shared/services/config/config.service";
import {MatDrawer} from "@angular/material";

@Component({
    selector: ".content_inner_wrapper",
    templateUrl: "./notes.component.html",
    styleUrls: ["./notes.component.scss"],
    providers: [NoteService]
})
export class NotesComponent implements OnInit {
    @ViewChild("leftSidenav2") leftSidenav2: MatDrawer;
    navMode = "side";
    isFocused: boolean = false;
    newNote: Note = new Note();
    notes = [];
    noteForm: FormGroup;
    editNoteForm: FormGroup;
    previewTitle: string;
    previewContent: string;
    showOverlay = false;
    showDeleteModal = false;
    noteToDelete = {};
    noteToEdit = {editing: false};
    md = new MarkdownIt();
    term: any;

    constructor(public config: ConfigService,
                private _elementRef: ElementRef,
                private _state: GlobalState,
                private noteService: NoteService,
                private fb: FormBuilder) {
        this.createForm();
    }

    createForm() {
        this.noteForm = this.fb.group({title: "", content: ""});
        this.previewTitle = "";
        this.previewContent = "";
        this.subscribeChanges();
    }

    getNotes() {
        this.notes = this.noteService.getAllNotes();
    }

    addDemoNotes() {
    }

    addNote(note) {
        this.newNote = note;
        this.noteService.addNote(this.newNote);
        this.newNote = new Note();
    }

    editNote(note) {
        this.editNoteForm = this.fb.group({
            title: note.title,
            content: note.content
        });
        //this.showOverlay = true;
        note.editing = true;
        this.noteToEdit = note;
        // Set focus to current note form textarea
        setTimeout(() => {
            this._elementRef.nativeElement
                .querySelector(".item__form textarea")
                .focus();
        }, 0);
    }

    removeNote(note) {
        this.noteService.deleteNoteById(note.id);
        this.closeDeleteModal();
        this.noteToDelete = {};
        this.getNotes();
    }

    subscribeChanges() {
        this.noteForm.controls["title"].valueChanges.subscribe(value => {
            this.previewTitle = value;
        });
        this.noteForm.controls["content"].valueChanges.subscribe(value => {
            this.previewContent = this.parseMarkdown(value);
        });
    }

    openDeleteModal(note) {
        this.showOverlay = true;
        this.showDeleteModal = true;
        this.noteToDelete = note;
    }

    closeDeleteModal() {
        this.showOverlay = false;
        this.showDeleteModal = false;
    }

    parseMarkdown(content) {
        return this.md.render(content);
    }

    onSubmit(value: any): void {
        this.addNote(value);
        this.createForm();
    }

    onEditSubmit(note: any, value: any): void {
        note.editing = false;
        delete note.editing;
        this.noteService.updateNoteById(note.id, value);
        this.showOverlay = false;
    }

    abortOverlay() {
        this.closeDeleteModal();
        this.noteToEdit.editing = false;
    }

    ngOnInit() {
        this.getNotes();
        this.subscribeChanges();
        if (window.innerWidth < 992) {
            this.navMode = "over";
            this.leftSidenav2.opened = false;
        }
        if (window.innerWidth > 992) {
            this.navMode = "side";
            this.leftSidenav2.open();
        }
    }

    @HostListener("window:resize", ["$event"])
    onResize(event) {
        if (event.target.innerWidth < 992) {
            this.navMode = "over";
            this.leftSidenav2.close();
        }
        if (event.target.innerWidth > 992) {
            this.navMode = "side";
            this.leftSidenav2.open();
        }
    }
}
