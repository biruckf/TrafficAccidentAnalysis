import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { Ng2ChartsComponent } from "./ng2-charts.component";
import { SharedModule } from "../../../shared/shared.module";

const NG2CHARTS_ROUTE = [{ path: "", component: Ng2ChartsComponent }];

@NgModule({
	declarations: [Ng2ChartsComponent],
	imports: [CommonModule, SharedModule, RouterModule.forChild(NG2CHARTS_ROUTE)]
})
export class Ng2ChartsModule {}
