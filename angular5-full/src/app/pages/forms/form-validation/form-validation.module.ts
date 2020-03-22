import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { FormValidationComponent } from "./form-validation.component";
import { SharedModule } from "../../../shared/shared.module";
import { ReactiveFormsModule, FormsModule } from "@angular/forms";
import { CustomFormsModule } from "ng2-validation";
const FORM_VALIDATION_ROUTE = [
	{ path: "", component: FormValidationComponent }
];

@NgModule({
	declarations: [FormValidationComponent],
	imports: [
		ReactiveFormsModule,
		FormsModule,
		CustomFormsModule,
		CommonModule,
		SharedModule,
		RouterModule.forChild(FORM_VALIDATION_ROUTE)
	]
})
export class FormValidationModule {}
