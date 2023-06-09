var url = "https://jsonplaceholder.typicode.com/posts"

fetch(url)
    .then(res => res.json())
    .then(data =>{
        displayUserInfo(data)
    })
    .catch(error => console.log(error))

    function displayUserInfo(users){
        let userE1 = document.getElementById("data");
        let output = "";
        for(user of users){
            output += `<div class="user">
               <div>${user.title}</div>
               <hr>
               <div>${user.body}</div>
              
            </div>`
        }

        userE1.innerHTML = output;
    }