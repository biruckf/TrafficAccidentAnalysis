import { Component, Input } from "@angular/core";
import { DataService } from "../../../services/data/data.service";

@Component({
	selector: "list-card",
	templateUrl: "./list-card.component.html",
	styleUrls: ["./list-card.component.scss"]
})
export class ListCardComponent {
	listItems;

	constructor(private _DataService: DataService) {
		//console.log(_DataService.getListCardDemo());

		this._DataService.getListCardDemo().subscribe(
			res => {
				this.listItems = res;
				//console.log(this.listItems);
			},
			error => console.log("error : " + error)
		);
	}
}
