import { Component } from "@angular/core";
import { GlobalState } from "../../app.state";
import { ConfigService } from "../../shared/services/config/config.service";

@Component({
	selector: ".content_inner_wrapper",
	templateUrl: "./pricing-tables.component.html",
	styleUrls: ["./pricing-tables.component.scss"]
})
export class PricingTablesComponent {
	isCardFlipped: boolean = false;

	onChange(value) {
		if (value.checked == true) {
			this.isCardFlipped = true;
		} else {
			this.isCardFlipped = false;
		}
	}
}
