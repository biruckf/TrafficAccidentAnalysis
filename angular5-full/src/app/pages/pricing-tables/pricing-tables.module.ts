import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { PricingTablesComponent } from './pricing-tables.component';
import { SharedModule } from '../../shared/shared.module';


const PRICING_TABLES_ROUTE = [
    { path: '', component: PricingTablesComponent },
];

@NgModule({
	  declarations: [PricingTablesComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(PRICING_TABLES_ROUTE)
    ]
  
})
export class PricingTablesModule { }
