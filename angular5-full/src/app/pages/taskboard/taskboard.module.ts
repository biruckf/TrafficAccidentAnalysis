import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { TaskboardComponent } from './taskboard.component';
import { SharedModule } from '../../shared/shared.module';


const TASKBOARD_ROUTE = [
    { path: '', component: TaskboardComponent },
];

@NgModule({
	  declarations: [TaskboardComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(TASKBOARD_ROUTE)
    ]
  
})
export class TaskboardModule { }
