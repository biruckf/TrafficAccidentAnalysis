import { NgModule, ApplicationRef } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { RouterModule } from "@angular/router";
import { LocationsComponent } from "./locations.component";
import { SharedModule } from "../../shared/shared.module";
import { AgmCoreModule } from "@agm/core";

const LOCATIONS_ROUTE = [{ path: "", component: LocationsComponent }];

@NgModule({
	declarations: [LocationsComponent],
	imports: [
		CommonModule,
		FormsModule,
		SharedModule,
		RouterModule.forChild(LOCATIONS_ROUTE),
		AgmCoreModule.forRoot({
			apiKey: "AIzaSyCLyFvB_0COov2Wg46S5PITX_d5srHyAwA"
		})
	]
})
export class LocationsModule {}
