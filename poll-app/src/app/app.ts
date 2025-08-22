import { Component, signal } from '@angular/core';
import { PollComponent } from './poll/poll.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PollComponent],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class AppComponent {
  protected readonly title = signal('poll-app');
}
