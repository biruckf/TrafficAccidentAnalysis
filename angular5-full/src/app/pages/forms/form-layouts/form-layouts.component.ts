import {
	Component,
	OnInit,
	trigger,
	state,
	style,
	transition,
	animate,
	ElementRef,
	HostListener,
	HostBinding
} from "@angular/core";
import { GlobalState } from "../../../app.state";
import { ConfigService } from "../../../shared/services/config/config.service";

@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./form-layouts.component.html",
	styleUrls: ["./form-layouts.component.scss"]
})
export class FormLayoutsComponent implements OnInit {
	//RADIO
	favoriteSeason: string;
	seasons = ["Winter", "Spring", "Summer", "Autumn"];
	
	favoriteMonth: string;
	months = ["Jan", "Feb", "March", "April" , "May" , "June" , "July"];
	
	favoriteYear: string;
	years = ["2010", "2011", "2012", "2013" , "2014" , "2015" , "2016", "2017"];
	
	constructor(
		public config: ConfigService,
		private _elementRef: ElementRef,
		private _state: GlobalState
	) {}

	ngOnInit() {}
}
