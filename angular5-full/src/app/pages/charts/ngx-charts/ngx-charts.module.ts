import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { NgxChartsComponent } from "./ngx-charts.component";
import { SharedModule } from "../../../shared/shared.module";

const NGXCHARTS_ROUTE = [{ path: "", component: NgxChartsComponent }];

@NgModule({
	declarations: [NgxChartsComponent],
	imports: [CommonModule, SharedModule, RouterModule.forChild(NGXCHARTS_ROUTE)]
})
export class NgxChartsModule {}
