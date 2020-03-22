import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ChartistComponent } from './chartist.component';
import { SharedModule } from '../../../shared/shared.module';


const CHARTIST_ROUTE = [
    { path: '', component: ChartistComponent },
];

@NgModule({
	  declarations: [ChartistComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(CHARTIST_ROUTE)
    ]
  
})
export class ChartistModule { }
