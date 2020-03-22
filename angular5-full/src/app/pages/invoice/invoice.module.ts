import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { InvoiceComponent } from './invoice.component';
import { SharedModule } from '../../shared/shared.module';


const INVOICE_ROUTE = [
    { path: '', component: InvoiceComponent },
];

@NgModule({
	  declarations: [InvoiceComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(INVOICE_ROUTE)
    ]
  
})
export class InvoiceModule { }
