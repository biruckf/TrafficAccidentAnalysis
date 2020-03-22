import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { FormCompComponent } from "./form-comp.component";
import { SharedModule } from "../../../shared/shared.module";
import { TextMaskModule } from "angular2-text-mask";
const FORM_COMPONENTS_ROUTE = [{ path: "", component: FormCompComponent }];

@NgModule({
	declarations: [FormCompComponent],
	imports: [
		FormsModule,
		TextMaskModule,
		CommonModule,
		SharedModule,
		RouterModule.forChild(FORM_COMPONENTS_ROUTE)
	]
})
export class FormCompModule {}
