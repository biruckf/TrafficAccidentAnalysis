import {Component, ElementRef, HostListener, OnInit, ViewChild} from "@angular/core";
import {GlobalState} from "../../app.state";
import {ConfigService} from "../../shared/services/config/config.service";
import {MatDrawer} from "@angular/material";
import {DataService} from "../../shared/services/data/data.service";

@Component({
    moduleId: module.id,
    selector: ".content_inner_wrapper",
    templateUrl: "./mail.component.html",
    styleUrls: ["./mail.component.scss"]
})
export class MailComponent implements OnInit {
    @ViewChild("leftSidenav2") leftSidenav2: MatDrawer;
    navMode = "side";
    displayMode: string = "default";
    multi: boolean = false;
    hideToggle: boolean = false;
    isFocused: boolean = false;
    highlight: boolean = false;
    selectedAll: any;
    listItems: any;
    selected: boolean = false;
    isComposeActive: boolean = false;
    open: boolean = false;
    spin: boolean = false;
    direction: string = "up";
    animationMode: string = "fling";
    term: any;
    checked: boolean = false;
    fixed: any;

    constructor(public config: ConfigService,
                private _elementRef: ElementRef,
                private _state: GlobalState,
                private _DataService: DataService) {
        this._DataService.getMailDemo().subscribe(
            res => {
                this.listItems = res;
            },
            error => console.log("error : " + error)
        );
    }

    selectAll() {
        for (var i = 0; i < this.listItems.length; i++) {
            this.listItems[i].selected = this.selectedAll;
        }
    }

    checkIfAllSelected() {
        this.selectedAll = this.listItems.every(function (item: any) {

            return item.selected == true;
        });
    }

    ngOnInit() {
        if (window.innerWidth < 992) {
            this.navMode = "over";
            this.leftSidenav2.opened = false;
        }
        if (window.innerWidth > 992) {
            this.navMode = "side";
            this.leftSidenav2.open();
        }
    }

    onMailChecked(event) {
        for (var i = 0; i < this.listItems.length; i++) {
            if (this.listItems[i].selected === true) {
                this.checked = true;
                return;
            } else {
                this.checked = false;
            }
        }

    }

    stopProp(event) {
        event.stopPropagation();
    }

    _click(event: any) {
        //console.log(event);
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
