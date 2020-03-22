import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MorrisComponent } from './morris.component';
import { SharedModule } from '../../../shared/shared.module';


const MORRIS_ROUTE = [
    { path: '', component: MorrisComponent },
];

@NgModule({
	  declarations: [MorrisComponent],
    imports: [
			CommonModule,
			SharedModule, 
			RouterModule.forChild(MORRIS_ROUTE)
    ]
  
})
export class MorrisModule { }
