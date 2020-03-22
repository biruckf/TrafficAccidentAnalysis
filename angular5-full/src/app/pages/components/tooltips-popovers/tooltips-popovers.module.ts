import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { TooltipsPopoversComponent } from './tooltips-popovers.component';
import { SharedModule } from '../../../shared/shared.module';
import { FormsModule, ReactiveFormsModule }   from '@angular/forms';

const TOOLTIPS_POPOVERS_ROUTE = [
    { path: '', component: TooltipsPopoversComponent },
];

@NgModule({
	  declarations: [TooltipsPopoversComponent],
    imports: [
			CommonModule,
			SharedModule,
			FormsModule,
			ReactiveFormsModule,
			RouterModule.forChild(TOOLTIPS_POPOVERS_ROUTE)
    ]
  
})
export class TooltipsPopoversModule { }
