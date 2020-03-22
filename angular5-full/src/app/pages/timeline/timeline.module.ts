import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { TimelineComponent } from './timeline.component';
import { SharedModule } from '../../shared/shared.module';


const TIMELINE_ROUTE = [
    { path: '', component: TimelineComponent },
];

@NgModule({
	  declarations: [TimelineComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(TIMELINE_ROUTE)
    ]
  
})
export class TimelineModule { }
