async function getAllAnimals(){
    const response = await fetch ("http://localhost:8080/animals")
    return await response.json();
}

function renderAnimal(animal){
    const animalCard = document.createElement("div");
    animalCard.setAttribute("class","card");
    animalCard.setAttribute("style","width:200px")

    const animalName = document.createElement("ul");
    animalName.innerHTML =animal.name;
    animalCard.appendChild(animalName)

    const animalAge = document.createElement("li");
    animalAge.innerHTML ="Age: " + animal.age;
    animalName.appendChild(animalAge)

    const animalGender = document.createElement("li");
    animalGender.innerHTML ="Gender: " + animal.gender;
    animalName.appendChild(animalGender)

    const animalCute = document.createElement("li");
    animalCute.innerHTML ="Cute: " + animal.cute;
    animalName.appendChild(animalCute)

    return animalCard
}

async function createUlAnimals() {
    const animals = await getAllAnimals();
    const element = document.getElementById("animals")
    animals.forEach(animal => {
        const animalCard = renderAnimal(animal);
        element.appendChild(animalCard)
    });
}

function renderToDom(targetElementId, createElementType, innerHTMLString) {
    // creates an HTML element of selected type
    // chould be a string. example: "li" creates an <li> element
    const element = document.createElement(createElementType);
    // gets HTML element with specified id from DOM
    const targetElement = document.getElementById(targetElementId);
    // appends previously created element
    // to element with specified id
    targetElement.appendChild(element);
    // sets inner HTML of previously created element
    // tp provided string. This can be valid HTML or just
    // some data of type String
    innerHTMLString ? (element.innerHTML = innerHTMLString) : "";
    // returns element so the element can be manipulated
    return element;
}

createUlAnimals().then(console.error);
