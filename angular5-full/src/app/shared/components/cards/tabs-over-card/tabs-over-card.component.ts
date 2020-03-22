import { Component, Input } from "@angular/core";

@Component({
	selector: "tabs-over-card",
	templateUrl: "./tabs-over-card.component.html",
	styleUrls: ["./tabs-over-card.component.scss"]
})
export class TabsOverCardComponent {
	@Input("tabColor") tabColor: string;
	constructor() {
		this.tabColor = this.tabColor || "";
	}
}
