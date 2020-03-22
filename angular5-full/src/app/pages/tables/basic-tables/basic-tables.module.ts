import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { BasicTablesComponent } from "./basic-tables.component";
import { SharedModule } from "../../../shared/shared.module";
const BASIC_TABLES_ROUTE = [{ path: "", component: BasicTablesComponent }];
import { NgxDatatableModule } from "@swimlane/ngx-datatable";
@NgModule({
	declarations: [BasicTablesComponent],
	imports: [
		CommonModule,
		SharedModule,
		NgxDatatableModule,
		RouterModule.forChild(BASIC_TABLES_ROUTE)
	]
})
export class BasicTablesModule {}
