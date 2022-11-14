//RESPOSTA COMPLETA DA API
export interface IFilmes {
    page: number
    total_pages: number
    total_results: number
    results: IFilme[] //8.2
}
//CADA FILME QUE ESTA DENTRO DO ARRAY RESULTS
//8.1
export interface IFilme {
    adult: boolean,
    backdrop_path: string,
    genre_ids: number[],
    id: number,
    original_language: string,
    original_title: string,
    overview: string,
    popularity: number,
    poster_path: string,
    release_date: string,
    title: string,
    video: boolean,
    vote_average: number,
    vote_count: number
}