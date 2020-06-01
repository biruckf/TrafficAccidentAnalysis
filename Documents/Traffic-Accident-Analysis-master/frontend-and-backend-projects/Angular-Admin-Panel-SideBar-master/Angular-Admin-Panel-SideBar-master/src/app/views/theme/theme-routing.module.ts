import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ColorsComponent } from './colors.component';
import { TypographyComponent } from './typography.component';
import { HomeComponent } from '../home/home.component';

import { LoginComponent } from '../login/login.component';

import { PersoninvehicleComponent } from './personinvehicle.component';
import { AccidentComponent } from './accident.component';
import { VehiclelistComponent } from './vehiclelist/vehiclelist.component';
import { MotoristComponent } from './motorist.component';
import { PedastrianComponent } from './pedastrian/pedastrian.component';
import { AccidentlistComponent } from './accidentlist/accidentlist.component';
import { AccidentdetailComponent } from './accidentdetail/accidentdetail.component';
import { MotoristdetailComponent } from './motoristdetail/motoristdetail.component';
import { AlldetailsComponent } from './alldetails/alldetails.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Theme'
    },
    children: [
      {
        path: '',
        redirectTo: 'colors'
      },
      {
        path: 'colors',
        component: ColorsComponent,
        data: {
          title: 'Colors'
        }
      },
      {
        path: 'home',
        component: HomeComponent,
        data: {
          title: 'Home'
        }
      },
      {
        path: 'accident',
        component: AccidentComponent,
        data: {
          title: 'Accident'
        }
      },
      {
        path: 'vehiclelist/:id',
        component: VehiclelistComponent,
        data: {
          title: 'VehicleList'
        }
      },
      {
        path: 'alldetails/:id',
        component: AlldetailsComponent,
        data: {
          title: 'Alldetails'
        }
      },
      {
        path: 'accidentlist',
        component: AccidentlistComponent,
        data: {
          title: 'AccidentList'
        }
      },
      {
        path: 'accidentdetail/:id',
        component: AccidentdetailComponent,
        data: {
          title: 'AccidentDetail'
        }
      },
      {
        path: 'motoristdetail/:id',
        component: MotoristdetailComponent,
        data: {
          title: 'MotoristDetail'
        }
      },
      {
        path: 'personinvehicle/:id',
        component: PersoninvehicleComponent,
        data: {
          title: 'Personinvehicle'
        }
      },
      {
        path: 'motorist/:id',
        component: MotoristComponent,
        data: {
          title: 'Motorist'
        }
      },
      {
        path: 'pedastrian/:id',
        component: PedastrianComponent,
        data: {
          title: 'Motorist'
        }
      },
      
      {
        path: 'typography',
        component: TypographyComponent,
        data: {
          title: 'Typography'
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ThemeRoutingModule {}
