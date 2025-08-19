export interface OptionVote{
    optionText: string
    vote: number;
}

export interface Poll {

    id: number;
    question: string;
    options: OptionVote[]; 

}
