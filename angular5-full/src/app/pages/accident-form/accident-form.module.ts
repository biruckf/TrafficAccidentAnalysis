import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { SharedModule } from '../../shared/shared.module';
import { AccidentFormComponent } from './accident-form.component';


const ACCIDENTFORM_ROUTE = [
    { path: '', component: AccidentFormComponent },
];

@NgModule({
	  declarations: [AccidentFormComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(ACCIDENTFORM_ROUTE)
    ]
  
})
export class ACCIDENTFORMMODULE { }
