
export class ClassRoomModel {

    
    constructor( 
            private _title: string,
            private _description: string){}
    

    get title(){
        return this._title
    }
    
    get description(){
        return this._description
    }

    set title(title: string){
        this._title = title
    }

    set description(description: string){
        this._description = description
    }
}
