const url = 'http://localhost:8080/P1-NoahSchlaupitzn/'



//populate table with tickets


    
    document.getElementById('getTicketButton').addEventListener('click', ticketFunc);

    async function ticketFunc() {
    
        let response = await fetch(url + 'printAllTickets', { credentials: "include" });
    
        if (response.status === 200) {
    
            let data = await response.json();
    
            console.log(data);
    
            for (let tickets of data) {
    
                let row = document.createElement("tr");
    
                let cell = document.createElement("td");
                cell.innerHTML = tickets.reimd_id;
                row.appendChild(cell)
    
                let cell2 = document.createElement("td");
                cell2.innerHTML = tickets.amount;
                row.appendChild(cell2)
    
                let cell3 = document.createElement("td");
                cell3.innerHTML = tickets.typeId.type;
                row.appendChild(cell3)
    
                let cell4 = document.createElement("td");
                cell4.innerHTML = tickets.statusId.status;
                row.appendChild(cell4);
    
                let cell5 = document.createElement("td");
                cell5.innerHTML = tickets.resolver.id;
                row.appendChild(cell5)
    
                document.getElementById("ticketBody").appendChild(row);
    
    
            }
    
        }

        



//insert a new ticket



    document.getElementById('ticketButton').addEventListener('click', newTicketFunc);

    async function newTicketFunc(){

        let response = await fetch(url + 'makeTicket', { credentials: "include" });

       

            let amount = document.getElementById("Amount").value;
            let type = document.getElementById("Type").value;
            let id = document.getElementById("Author").value;

            let newTicket = {

                Amount:amount,
                Type:type,
                Author:id

            }


        if(response.status === 200){
            console.log("ok");
        }

    }


    



}



document.getElementById('logoutButton').addEventListener('click', logoutFunc);

async function logoutFunc(){
    location.replace("http://127.0.0.1:5500/html/index.html")
}
