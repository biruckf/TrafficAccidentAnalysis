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
	templateUrl: "./dropdowns.component.html",
	styleUrls: ["./dropdowns.component.scss"]
})
export class DropdownsComponent {
	status: { isopen: boolean } = { isopen: false };
	
	public items: string[] = [
		"The first choice!",
		"And another choice for you.",
		"but wait! A third!"
	];
	
	public onHidden(): void {
		//console.log("Dropdown is hidden");
	}
	public onShown(): void {
		//console.log("Dropdown is shown");
	}
	public isOpenChange(): void {
		//console.log("Dropdown state is changed");
	}
	
	
	
	public toggleDropdown($event: MouseEvent): void {
		$event.preventDefault();
		$event.stopPropagation();
		this.status.isopen = !this.status.isopen;
	}
	
	change(value: boolean): void {
		this.status.isopen = value;
	}
	
}
