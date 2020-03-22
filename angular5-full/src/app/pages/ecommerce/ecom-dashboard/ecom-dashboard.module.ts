import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { EcomDashboardComponent } from './ecom-dashboard.component';
import { SharedModule } from '../../../shared/shared.module';
import {CountUpDirective} from  '../../../shared/directives/countUp.directive';

const ECOM_DASHBOARD_ROUTE = [
    { path: '', component: EcomDashboardComponent },
];

@NgModule({
	  declarations: [EcomDashboardComponent,CountUpDirective],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(ECOM_DASHBOARD_ROUTE)
    ]
  
})
export class EcomDashboardModule { }
