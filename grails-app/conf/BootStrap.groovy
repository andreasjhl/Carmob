package conn

class BootStrap {

    def init = { servletContext ->
        
        new Angle(  name:"zu Hause",         
            address:"herrmann",         
            post_code:"12053",        
            city:"Berlin").save()
        
        /*  
        new Angle(  name:"zu Hause",         
            address:"herrmann",         
            post_code:"12053",        
            city:"Berlin").save

        if(!Trip.count()){
            new Trip()
                .addToConnections(
                    new Connection(
                        transMean:new TransportationMean(name:'Fahrrad').save,
                        start:"Hermannstr 100",
                        end:"Hermannplatz",
                        start_time: new Date(),
                        end_time:new Date()+1)
                        .save)
                .addToConnections(
                    new Connection(
                        transMean:new TransportationMean(name:'Auto').save,
                        start:"Hermannplatz",
                        end:"HBF Berlin",
                        start_time: new Date()+1,
                        end_time:new Date()+2)
                        .save)
                .save
            }
            */

    }
    def destroy = {
    }
}
