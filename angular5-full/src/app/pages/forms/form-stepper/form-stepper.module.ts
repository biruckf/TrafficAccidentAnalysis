import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { SharedModule } from "../../../shared/shared.module";
import {FormStepperComponent} from "./form-stepper.component";
const FORM_STEPPER_ROUTE = [{ path: "", component: FormStepperComponent }];

@NgModule({
	declarations: [FormStepperComponent],
	imports: [
		CommonModule,
		SharedModule,
		RouterModule.forChild(FORM_STEPPER_ROUTE)
	]
})
export class StepperModule {}
