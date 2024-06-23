console.log("chALA")
function validateForm(){
    console.log("function mai aaya control")
    var firstName=document.getElementById("firstname").value;
    var lastName=document.getElementById("lastname").value;
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    var confirmPassword=document.getElementById("confirm").value;

    var firstNameError=document.getElementById("firstNameError");
    var lastNameError=document.getElementById("lastNameError");
    var emailError=document.getElementById("emailError");
    var passwordError=document.getElementById("passwordError");
    var confirmError=document.getElementById("confirmError");

    firstNameError.textContent='';
    lastNameError.textContent='';
    emailError.textContent='';
    passwordError.textContent='';
    confirmError.textContent='';

    if(firstName===''){
        firstNameError.textContent='First Name is required';
        return false;
    }
    else if(firstName.length<3){
        firstNameError.textContent='First name must be at least 3 character long'
        return false;
    }


    if(lastName===''){
        lastNameError.textContent='Last Name is required';
        return false;
    }
    else if(lastName.length<3){
        lastNameError.textContent='Last name must be at least 3 character long'
        return false;
    }


    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (email === '') {
        emailError.textContent = 'Email is required';
        return false;
    }
    else if (!emailPattern.test(email)) {
        emailError.textContent = 'Invalid email address';
        return false;
    }


    if (password === '') {
        passwordError.textContent = 'Password is required';
        return false;
    }
    else if (password.length < 8) {
        passwordError.textContent = 'Password must be at least 8 characters long';
        return false;
    }


    if (confirmPassword === '') {
        confirmError.textContent = 'Confirm Password is required';
        return false;
    }
    else if (password !== confirmPassword) {
        confirmError.textContent = 'Passwords do not match';
        return false;
    }

    return true;
}

// function validateForm(){
//     var firstName=document.getElementById('firstName').value;
//     var lastName=document.getElementById('lastName').value;
//     var email=document.getElementById('email').value;
//     var password=document.getElementById('password').value;
//     var confirmPassword=document.getElementById('confirmPassword').value;

//     var firstNameError=document.getElementById('firstNameError');
//     var lastNameError=document.getElementById('lastNameError');
//     var emailError=document.getElementById('emailError');
//     var passwordError=document.getElementById('passwordError');
//     var confirmPasswordError=document.getElementById('confirmPasswordError');

//     firstNameError.textContent='';
//     lastNameError.textContent='';
//     emailError.textContent='';
//     passwordError.textContent='';
//     confirmPassword.textContent='';

//     if(firstName===''){
//         firstNameError.textContent='First Name is required';
//         return false;
//     }
//     else if(firstName.length<3){
//         firstNameError.textContent='First name must be at least 3 character long'
//         return false;
//     }


//     if(lastName===''){
//         lastNameError.textContent='Last Name is required';
//         return false;
//     }
//     else if(lastName.length<3){
//         lastNameError.textContent='Last name must be at least 3 character long'
//         return false;
//     }


//     var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
//     if (email === '') {
//         emailError.textContent = 'Email is required';
//         return false;
//     }
//     else if (!emailPattern.test(email)) {
//         emailError.textContent = 'Invalid email address';
//         return false;
//     }


//     if (password === '') {
//         passwordError.textContent = 'Password is required';
//         return false;
//     }
//     else if (password.length < 8) {
//         passwordError.textContent = 'Password must be at least 8 characters long';
//         return false;
//     }


//     if (confirmPassword === '') {
//         confirmPasswordError.textContent = 'Confirm Password is required';
//         return false;
//     }
//     else if (password !== confirmPassword) {
//         confirmPasswordError.textContent = 'Passwords do not match';
//         return false;
//     }

//     return true;
// }