import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { ProfileComponent } from './profile.component';
import { SharedModule } from '../../shared/shared.module';


const PROFILE_ROUTE = [
    { path: '', component: ProfileComponent },
];

@NgModule({
	  declarations: [ProfileComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(PROFILE_ROUTE)
    ]
  
})
export class ProfileModule { }
