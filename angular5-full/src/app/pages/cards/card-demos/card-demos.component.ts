import { Component, OnInit, ViewEncapsulation } from "@angular/core";

@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./card-demos.component.html",
	styleUrls: ["./card-demos.component.scss"],
	encapsulation: ViewEncapsulation.Emulated
})
export class CardDemosComponent implements OnInit {
	//Header Title
	title: string = "Card Demos";
	constructor() {}

	ngOnInit() {}
}
