// Angular
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { ColorsComponent } from './colors.component';
import { TypographyComponent } from './typography.component';

// Theme Routing
import { ThemeRoutingModule } from './theme-routing.module';
import { HomeComponent } from '../home/home.component';

import { PersoninvehicleComponent } from './personinvehicle.component';

import { MotoristComponent } from './motorist.component';
import { AccidentComponent } from './accident.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { VehicleComponent } from './vehicle/vehicle.component';
import { VehiclelistComponent } from './vehiclelist/vehiclelist.component';
import { PedastrianComponent } from './pedastrian/pedastrian.component';
import { AccidentlistComponent } from './accidentlist/accidentlist.component';
import { AccidentdetailComponent } from './accidentdetail/accidentdetail.component';
import { MotoristdetailComponent } from './motoristdetail/motoristdetail.component';
import { AlldetailsComponent } from './alldetails/alldetails.component';


@NgModule({
  imports: [
    CommonModule,
    ThemeRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    
    
  ],
  declarations: [
    ColorsComponent,
    TypographyComponent,
    HomeComponent,
    AccidentComponent,
    PersoninvehicleComponent,
    
    MotoristComponent,
    VehicleComponent,
    VehiclelistComponent,
    PedastrianComponent,
    AccidentlistComponent,
    AccidentdetailComponent,
    MotoristdetailComponent,
    AlldetailsComponent,

    
    
  ]
})
export class ThemeModule { }
