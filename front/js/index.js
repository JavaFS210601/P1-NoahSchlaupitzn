const url = 'http://localhost:8080/P1-NoahSchlaupitzn/'

//first piority is making sure login works.


document.getElementById("loginButton").addEventListener('click', loginFunc)

async function loginFunc(){

    console.log("hello");

    //receiving user inputs for logging in
    let usern = document.getElementById("username").value;
    let userp = document.getElementById("password").value;
    let userid = document.getElementById("id").value;

    //sending login cred as json
    let user = {
        username:usern,
        password:userp,
        id:userid
    }

    console.log(user);

    let response = await fetch(url + "login", {

        method: "POST",
        body: JSON.stringify(user),
        credentials: "include"

    })

    console.log(response.status);

   if(response.status === 200){

    document.getElementById("login-row").innerText="Welcome!";

    if(userid == 1){
    location.replace("http://127.0.0.1:5500/html/employee.html")
    } else {
    location.replace("http://127.0.0.1:5500/html/manager.html")
    }


} else {
    document.getElementById("login-row").innerText="Login Failed! Refresh the page!";

    }

}
