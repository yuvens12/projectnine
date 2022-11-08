import React, { Component } from 'react'
 import {StyleSheet, TouchableOpacity, Text, View} from 'react-native'
 
 class App extends Component {
   state = {
     count: 0
   }
 
   onPress = () => {
     this.setState({
       count: this.state.count + 1
     })
   }
 
  render() {
     return (
       <View style={styles.container}> 
        <Text style={styles.highlight}>Tekan Tombol Dibawah Ini!!!</Text>
          
         <TouchableOpacity style={styles.button} onPress={this.onPress}>
            <Text>Klik Disini</Text>
         </TouchableOpacity>
         <View>
           <Text>
             Anda telah mengklik sebanyak { this.state.count } kali
           </Text>
         </View>
       </View>
     )
   }
 }
 
 const styles = StyleSheet.create({
   container: {
     flex: 1,
     justifyContent: 'center',
     alignItems: 'center',
     backgroundColor: '#DDDDff'
   },
   button: {
     alignItems: 'center',
     backgroundColor: '#DDDDDD',
     padding: 10,
     marginBottom: 10
   }
 })
 
 export default App;