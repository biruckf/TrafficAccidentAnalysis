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
	templateUrl: "./collapsible.component.html",
	styleUrls: ["./collapsible.component.scss"]
})
export class CollapsibleComponent {
	displayMode: string = "default";
	multi: boolean = false;
	hideToggle: boolean = false;
	showPanel3 = true;
}
