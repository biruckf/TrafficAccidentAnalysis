import { Component } from "@angular/core";

@Component({
	selector: "ng2-charts-doughnut",
	template: `
			<div style="display: block;">
			<canvas baseChart class="chart"
			[data]="doughnutChartData"
			[labels]="doughnutChartLabels"
			[chartType]="doughnutChartType"
				[colors]="doughnutChartColors"></canvas>
			</div>
	`
})
export class ng2DoughnutChartDemoComponent {
	public doughnutChartLabels: string[] = [
		"Download Sales",
		"In-Store Sales",
		"Mail-Order Sales"
	];
	public doughnutChartData: number[] = [350, 450, 100];
	public doughnutChartType: string = "doughnut";
	public doughnutChartColors: Array<any> = [
		{
			backgroundColor: ["#5867C3", "#28BEBD", "#42A5F5"]
		}
	];
}
