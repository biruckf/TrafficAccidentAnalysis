import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { SharedModule } from "../../../shared/shared.module";
import { TextMaskModule } from "angular2-text-mask";
import { AdminComponent } from "./admin.component";
const ADMIN_ROUTE = [{ path: "", component: AdminComponent }];

@NgModule({
	declarations: [AdminComponent],
	imports: [
		FormsModule,
		TextMaskModule,
		CommonModule,
		SharedModule,
		RouterModule.forChild(ADMIN_ROUTE)
	]
})
export class AdminModule {}
