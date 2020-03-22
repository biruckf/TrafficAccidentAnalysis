import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CardTemplatesComponent } from './card-templates.component';
import { SharedModule } from '../../../shared/shared.module';


const CARD_TEMPLATES_ROUTE = [
    { path: '', component: CardTemplatesComponent },
];

@NgModule({
	  declarations: [CardTemplatesComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(CARD_TEMPLATES_ROUTE)
    ]
  
})
export class CardTemplatesModule { }
