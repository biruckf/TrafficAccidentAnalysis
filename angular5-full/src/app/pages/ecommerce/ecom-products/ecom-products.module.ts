import { CommonModule } from "@angular/common";
import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { EcomProductsComponent } from "./ecom-products.component";
import { SharedModule } from "../../../shared/shared.module";
//Datatables
import { NgxDatatableModule } from "@swimlane/ngx-datatable";
const ECOM_PRODUCTS_ROUTE = [{ path: "", component: EcomProductsComponent }];

@NgModule({
	declarations: [EcomProductsComponent],
	imports: [
		CommonModule,
		SharedModule,
		NgxDatatableModule,
		RouterModule.forChild(ECOM_PRODUCTS_ROUTE)
	]
})
export class EcomProductsModule {}
