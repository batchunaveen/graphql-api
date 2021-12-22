
function fetchingData() {
    var schema = buildSchema(`
        type Cards {
        id: int,
        type: int,
        from: string,
        back: string
        }
        
    `)

      var query = `query { 
        cards {  
           id    
           type     
           front     
           back     
           known    
           } 
        }`;
      fetch('/graphql', {
          method: 'POST',
          headers: {
              'Content-Type': 'application/json',
              'Accept': 'application/json',
          },
          body: JSON.stringify({
              query
          })
      })
          .then(response => response.json())
          .then(
              ({data}) =>
                `<p>Id : ${data.id} </p>
                 <p>Type: ${data.type} </p>
                 <p>Front: ${data.front} </p>`
            )
          .then(text => (document.body.innerHTML = text))
          .catch( error => console.log(error));
  }
  fetchingData();
