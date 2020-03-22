import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { EcomSettingsComponent } from './ecom-settings.component';
import { SharedModule } from '../../../shared/shared.module';


const ECOM_SETTINGS_ROUTE = [
    { path: '', component: EcomSettingsComponent },
];

@NgModule({
	  declarations: [EcomSettingsComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(ECOM_SETTINGS_ROUTE)
    ]
  
})
export class EcomSettingsModule { }
