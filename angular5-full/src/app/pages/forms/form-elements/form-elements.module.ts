import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormElementsComponent } from './form-elements.component';
import { SharedModule } from '../../../shared/shared.module';


const FORM_ELEMENTS_ROUTE = [
    { path: '', component: FormElementsComponent },
];

@NgModule({
	  declarations: [FormElementsComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(FORM_ELEMENTS_ROUTE)
    ]
  
})
export class FormElementsModule { }
