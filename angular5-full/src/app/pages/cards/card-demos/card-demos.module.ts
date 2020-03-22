import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CardDemosComponent } from './card-demos.component';
import { SharedModule } from '../../../shared/shared.module';


const CARD_DEMOS_ROUTE = [
    { path: '', component: CardDemosComponent },
];

@NgModule({
	  declarations: [CardDemosComponent],
    imports: [
			CommonModule,
			SharedModule,
			RouterModule.forChild(CARD_DEMOS_ROUTE)
    ]
  
})
export class CardDemosModule { }
