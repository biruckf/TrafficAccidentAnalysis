import { Component } from "@angular/core";

@Component({
	selector: "scrum-card",
	templateUrl: "./scrum-card.component.html",
	styleUrls: ["./scrum-card.component.scss"]
})
export class ScrumCardComponent {
	//Configure progressbars
	progressColor = "primary";
	progressMode = "determinate";
	progressValue = 60;
	progressBufferValue = 75;

	onHoldColor = "accent";
	onHoldMode = "determinate";
	onHoldValue = 40;
	onHoldBufferValue = 75;

	completedColor = "warn";
	completedMode = "determinate";
	completedValue = 80;
	completedBufferValue = 75;
}
