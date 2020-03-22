import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { EcomCustomersComponent } from "./ecom-customers.component";
import { SharedModule } from "../../../shared/shared.module";
//Datatables
import { NgxDatatableModule } from "@swimlane/ngx-datatable";

const ECOM_CUSTOMERS_ROUTE = [{ path: "", component: EcomCustomersComponent }];

@NgModule({
	declarations: [EcomCustomersComponent],
	imports: [
		CommonModule,
		SharedModule,
		NgxDatatableModule,
		RouterModule.forChild(ECOM_CUSTOMERS_ROUTE)
	]
})
export class EcomCustomersModule {}
