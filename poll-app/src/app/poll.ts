import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Poll } from './poll.models';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment';


@Injectable({providedIn: 'root'})
export class PollService {
  private baseUrl = `${environment.apiBaseUrl}/api/polls`;

  constructor(private http: HttpClient){ }

  createPoll(poll: Poll){
    return this.http.post<Poll>(this.baseUrl, poll);
  }

  getPolls(){
    return this.http.get<Poll[]>(this.baseUrl);
  }

  vote(pollId: number, optionIndex: number){
    return this.http.post<void>(`${this.baseUrl}/vote`, {pollId, optionIndex});
  }

}
