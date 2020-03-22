import { Component, OnInit, ViewEncapsulation } from "@angular/core";

@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./card-templates.component.html",
	styleUrls: ["./card-templates.component.scss"],
	encapsulation: ViewEncapsulation.Emulated
})
export class CardTemplatesComponent implements OnInit {
	//Header Title
	title: string = "Card Templates";
	public scrollbarOptions = { axis: "y", theme: "minimal-dark" };
	constructor() {}

	ngOnInit() {}
}
