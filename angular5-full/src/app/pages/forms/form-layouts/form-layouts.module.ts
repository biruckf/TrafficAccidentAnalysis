import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { FormLayoutsComponent } from "./form-layouts.component";
import { SharedModule } from "../../../shared/shared.module";

const FORM_LAYOUTS_ROUTE = [{ path: "", component: FormLayoutsComponent }];

@NgModule({
	declarations: [FormLayoutsComponent],
	imports: [
		CommonModule,
		SharedModule,
		RouterModule.forChild(FORM_LAYOUTS_ROUTE)
	]
})
export class FormLayoutsModule {}
