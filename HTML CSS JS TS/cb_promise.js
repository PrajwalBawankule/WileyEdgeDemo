console.log("Starting")

function userLoin(username,pw){
    return new Promise((resolve,reject) => {
        setTimeout(() =>{
            console.log("User logged in");
            resolve({uname:username})
        },5000);
    });
}

function getProjectByUser(uname){
    return new Promise((resolve,reject) => {
        setTimeout(() =>{
            console.log("Projects are here");
            resolve({["proj1","proj2","proj3"]})
        },5000);
    }); 
}

function projDetails(proj){
    return new Promise((resolve,reject) => {
        setTimeout(() =>{
            resolve("Project Details")
        },5000);
    }); 
}

userLogin("prajwal","1234")
    .then(user => getProjectByUser(user))
    .then( projects => projDetails(projects[0]))
    .then(details => console.log(details))
    .catch(err=>console.log(err))
    .finally(() => console.log("Final message"))

