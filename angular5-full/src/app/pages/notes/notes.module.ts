import {CommonModule} from "@angular/common";
import {NgModule} from "@angular/core";
import {RouterModule} from "@angular/router";
import {NotesComponent} from "./notes.component";
import {SharedModule} from "../../shared/shared.module";

const NOTES_ROUTE = [{ path: "", component: NotesComponent }];


// TODO: Add New Masonry
@NgModule({
	declarations: [NotesComponent],
	imports: [
		CommonModule,
		SharedModule,
		RouterModule.forChild(NOTES_ROUTE),
	]
})
export class NotesModule {}
