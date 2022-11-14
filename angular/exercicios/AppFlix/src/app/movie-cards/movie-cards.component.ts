import { Component, Input } from '@angular/core';
import { IFilme } from '../interfaces/interfaces';

@Component({
  selector: 'movie-cards',
  templateUrl: './movie-cards.component.html',
  styleUrls: ['./movie-cards.component.css']
})
export class MovieCardsComponent {

  constructor() { }

  @Input() movie! : IFilme

  /*@Input() movie: IFilme = {
    adult: false,
    backdrop_path: "",
    genre_ids: [],
    id: 0,
    original_language: "",
    original_title: "",
    overview: "",
    popularity: 0,
    poster_path: "",
    release_date: "",
    title: "",
    video: false,
    vote_average: 0,
    vote_count: 0
  }*/
}
