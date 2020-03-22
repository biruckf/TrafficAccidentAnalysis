import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FileManagerComponent } from './file-manager.component';
import { SharedModule } from '../../shared/shared.module';


const FILE_MANAGER_ROUTE = [
    { path: '', component: FileManagerComponent },
];

@NgModule({
	  declarations: [FileManagerComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(FILE_MANAGER_ROUTE)
    ]
  
})
export class FileManagerModule { }
